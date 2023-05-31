import java.util.Scanner;

public class ResistorProcess
{
    ResistorsService service = new ResistorsService();
    Scanner scan = new Scanner(System.in);

    private void insertRes(Resistors resistor)
    {
        System.out.print("Part Number : ");
        resistor.setPartNumber(scan.nextLine());

        System.out.print("Description : ");
        resistor.setDescription(scan.nextLine());

        System.out.print("Value : ");
        resistor.setValue(scan.nextInt());

        //Burada yarım bıraktım. DEvam edilecek.

        service.insertRes(resistor);
    }
}
