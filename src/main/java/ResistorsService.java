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
    public void createTable()
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
}
