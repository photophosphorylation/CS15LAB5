public class Hello
{
    public static void main( String argv[] )
    {
	//Author: Thomas Gui (tgui@ucsd.edu)
	//default is "World"
        String name = "World";
        if ( argv.length != 0 )
        {
            name = argv[0];
        }

        System.out.println( "Hello, " + name + "!" );
    }
}
