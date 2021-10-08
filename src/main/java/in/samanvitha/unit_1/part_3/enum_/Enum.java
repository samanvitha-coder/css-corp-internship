package in.samanvitha.unit_1.part_3.enum_;

public class Enum {

        public enum Season
        { WINTER, SPRING, SUMMER, FALL }
        public static void main(String[] args)
        {
            for (Season s : Season.values())
                System.out.println(s);
        }
    }
/* The values() method returns an array containing all the values of the enum. */
