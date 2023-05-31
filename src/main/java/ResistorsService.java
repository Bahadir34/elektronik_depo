import java.sql.*;

public class ResistorsService implements DepoServices
{

    private Connection con;
    private Statement st;
    private PreparedStatement prst;

    private void setConnection() throws SQLException
    {
        this.con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/elektronik_depo","bahadir","Sadakat_34");
    }

    private void setStatement() throws SQLException
    {
        this.st = con.createStatement();
    }

    private void setPreparedStatement(String query) throws SQLException
    {
        this.prst = con.prepareStatement(query);
    }

    @Override
    public boolean createTable()
    {
        try {
            setConnection();
            setStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            String query = "CREATE TABLE IF NOT EXISTS resistors(" +
                    "id SERIAL UNIQUE," +
                    "Part_Number VARCHAR(50)," +
                    "Description VARCHAR(50)," +
                    "Value INT," +
                    "Unit CHAR(1)," +
                    "Power REAL," +
                    "Tolerance INT," +
                    "Mounting_Type VARCHAR(10)," +
                    "Package VARCHAR(20)," +
                    "Quantity INT," +
                    "Repo_Place varchar(50))";
            st.execute(query);
            return true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally
        {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }


   public boolean insertRes(Resistors resistor)
   {
       try {
           setConnection();
           String query = "INSERT INTO elektronik_depo(part_number,description,value,unit,power,tolerance,mounting_type,package,quantity,repo_place) VALUES (?,?,?,?,?,?,?,?,?)";
           setPreparedStatement(query);
           prst.setString(1,resistor.getPartNumber());
           prst.setString(2,resistor.getDescription());
           prst.setDouble(3,resistor.getValue());
           prst.setString(4,String.valueOf(resistor.getUnit()));
           prst.setDouble(5,resistor.getPower());
           prst.setInt(6,resistor.getTolerance());
           prst.setString(7,resistor.getMountingType());
           prst.setString(8,resistor.getComponentPackage());
           prst.setInt(9,resistor.getQuantity());
           prst.setString(10,resistor.getRepoPlace());
           prst.executeUpdate();

       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
       finally
       {
           try {
               con.close();
               prst.close();
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }


       }


       return false;
   }

}
