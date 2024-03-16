package OOPS;

import OOPS.Interface.Parent;

public class Enums
{
    public enum Month {
        // each Object predefine there parameter
        // each time its assign to a new Month type this will run
        // his corresponding constructor

        JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30),
        OCTOBER(31), NOVEMBER(30), DECEMBER(31),
        JANUARY_31, FEBRUARY_28, MARCH_31, APRIL_30, MAY_31, JUNE_30, JULY_31, AUGUST_31, SEPTEMBER_30, OCTOBER_31, NOVEMBER_30, DECEMBER_31, NoThing_Month;


        private int days;

        Month()
        {
            System.out.println(this+" days Wasted");
        }

        Month(int days)         // is not just constructor it functionality base on enums objects
        {                       // it will automatically take actions
            System.out.println(this);
            this.days = days;
        }

        public int getDays() {
            return days;
        }
    }
    public enum week implements Parent
    {
        // every object is have same parameters no need for constructors
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday;


        // Interface inheritable but class not inheritable`
        @Override
        public void Career() {
            System.out.println("just testing Implement are Works or not");
        }

        @Override
        public void Partner() {

            System.out.println("just testing Implement are Works or not");
        }
    }

        public static void main(String[] args) {
            // Iterate over the months and print the days

            Month mon = Month.NoThing_Month;   // this assign all the object that have no parameter to mon
            Month mons = Month.APRIL;          // this assign all Object that have one parameter   to mons

//            for (Month month : Month.values())
//            {
//                System.out.println(month + " has " + month.getDays() + " days.");
//            }
    }

}
