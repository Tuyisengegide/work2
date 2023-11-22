 class switch2 {      

      public enum Day {  S, M, T, W, Th, F, St  }    

      public static void main(String args[])    

      {    

        Day[] DayNow = Day.values();    

          for (Day Now : DayNow)    

          {    

                switch (Now)    

                {    

                    case S:    

                        System.out.println("Sunday");    

                        break;    

                    case M:    

                        System.out.println("Monday");    

                        break;    

                    case T:    

                        System.out.println("Tuesday");    

                        break;         

                    case W:    

                        System.out.println("Wednesday");    

                        break;    

                    case Th:    

                        System.out.println("Thursday");    

                        break;    

                    case F:    

                        System.out.println("Friday");    

                        break;    

                    case St:    

                        System.out.println("Saturday");    

                        break;    

                }    

            }    

        }    

}    