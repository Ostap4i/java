 class MenuItem {
     private int  name;
     private double price;
     private int sale;


     public double clculetesale(String  name, int price, int sale) {
         if (name == "pizza") {
             price = 390;
             sale = 15 %;

         }
         if (name == "sushi") {
             price = 150;
             sale = 5 %;

         }

         if (name == "pasta") {
             price = 200;
             sale = 10 %;
         }


         if (name == "soup") {
             price = 100;
             sale = 5 %;

         }
         if (name == "cheaken") {
             price = 300;
             sale = 10 %;
         }
         if (name == "ribs") {
             price = 400;
             sale = 15 %;
         }
         if (name == "turkey") {
             price = 500;
             sale = 20 %;

             if (name == "kebab") {
                 price = 400;
                 sale = 10;
             }
             if (name == "cucumber") {
                 price = 75;
                 sale = 2 %;
             }
             if (name == "tomato") {
                 price = 75;
                 sale = 2 %;
             }
             if (name == "carrot") {
                 price = 75;
                 sale = 5 ;
             }
             if (name == "cake") {
                 price = 260;
                 sale = 7 ;
             }
             if (name == "salad") {
                 price = 200;
                 sale = 5 ;
             }
             if (name == "shrimp") {
                 price = 1000;
                 sale = 30 ;

             }


         }
     }








     public double getPrice() {


     }
 }