public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.pausetime=0;
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());
        HotPinkFilter();
        plane.teleport(135,195);
        DollarSign();
        plane.teleport(535,626);
        DollarSign();
        plane.teleport(547,234);
        SidewaysGreed();
        plane.teleport(30,704);
        SidewaysFame();
        plane.teleport(1000,1000);


            }



    public void DollarSign(){
        plane.isTrail=true;
        plane.trailWidth=10;
        plane.setColor(57,189,53);
        plane.startingAngle(180);
        plane.move(70);
        plane.turn(90);
        plane.move(35);
        plane.turn(90);
        plane.move(70);
        plane.turn(-90);
        plane.move(35);
        plane.turn(-90);
        plane.move(70);
        plane.startingAngle(0);
        plane.isTrail=false;
        plane.move(35);
        plane.isTrail=true;
        plane.startingAngle(90);
        plane.move(20);
        plane.startingAngle(270);
        plane.move(115);
    }

    public void HotPinkFilter() {

        for (int row = 0; row < 799; row = row + 1) {
            for (int col = 0; col < 587; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                //plane.teleport(col, 799 - row); //flips picture upside down
                if (red < 260 && red > 245 && green < 260 && green > 240 && blue < 60 && blue > 40) {
                    plane.setPixelColor(252, 3, 111);
                } else if (red > 220 && red < 260 && green < 270 && green > 180 && blue > 60 && blue < 200) {
                    plane.setPixelColor(252, 3, 111);
                }
            }
        }
    }

    public void SidewaysGreed(){

        plane.isTrail=true;
        plane.trailWidth=10;
        plane.setColor(57,189,53);
        //letter G
        plane.startingAngle(270);
        plane.move(60);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(60);
        plane.turn(90);
        plane.move(45);
        plane.turn(90);
        plane.move(30);

        //moving to R
        plane.isTrail=false;
        plane.startingAngle(90);
        plane.move(60);
        plane.startingAngle(0);
        plane.move(55);
        plane.isTrail=true;

        //letter R
        plane.startingAngle(180);
        plane.move(100);
        plane.turn(180);
        plane.move(100);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-90);
        plane.move(40);
        plane.turn(-90);
        plane.move(50);
        plane.startingAngle(135);
        plane.move(75);

        //moving to letter E #1
        plane.isTrail=false;
        plane.startingAngle(90);
        plane.move(30);
        plane.startingAngle(0);
        plane.move(95);
        plane.isTrail=true;

        //Letter E #1
        plane.startingAngle(180);
        plane.move(100);
        plane.turn(90);
        plane.move(40);
        plane.turn(180);
        plane.move(40);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-90);
        plane.move(40);
        plane.turn(180);
        plane.move(40);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-90);
        plane.move(40);

        //moving to letter E #2
        plane.isTrail=false;
        plane.move(30);
        plane.isTrail=true;

        //letter E #2 (same code as before)
        plane.startingAngle(180);
        plane.move(100);
        plane.turn(90);
        plane.move(40);
        plane.turn(180);
        plane.move(40);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-90);
        plane.move(40);
        plane.turn(180);
        plane.move(40);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-90);
        plane.move(40);

        //moving to letter D
        plane.isTrail=false;
        plane.move(30);
        plane.isTrail=true;

        //letter D
        plane.startingAngle(180);
        plane.move(100);
        plane.turn(120);
        plane.move(40);
        plane.startingAngle(0);
        plane.move(50);
        plane.turn(45);
        plane.move(40);
    }

    public void SidewaysFame(){

        plane.isTrail=true;
        plane.trailWidth=10;
        plane.setColor(57,189,53);

        //letter F
        plane.startingAngle(0);
        plane.move(100);
        plane.turn(180);
        plane.move(100);
        plane.turn(-90);
        plane.move(45);
        plane.turn(180);
        plane.move(45);
        plane.turn(90);
        plane.move(35);
        plane.turn(90);
        plane.move(35);

        //moving to letter A
        plane.turn(180);
        plane.move(35);
        plane.turn(-90);
        plane.move(35);
        plane.turn(-90);
        plane.isTrail=false;
        plane.move(85);
        plane.isTrail=true;

        //letter A
        plane.startingAngle(20);
        plane.move(115);
        plane.turn(180);
        plane.move(115);
        plane.startingAngle(270);
        plane.move(15);
        plane.turn(-70);
        plane.move(115);
        plane.turn(180);
        plane.move(65);
        plane.turn(70);
        plane.move(50);

        //moving to letter M
        plane.isTrail=false;
        plane.turn(180);
        plane.move(100);
        plane.startingAngle(180);
        plane.move(45);
        plane.isTrail=true;

        //letter M
        plane.startingAngle(0);
        plane.move(100);
        plane.turn(180);
        plane.move(100);
        plane.turn(-90);
        plane.move(5);
        plane.turn(-55);
        plane.move(40);
        plane.turn(110);
        plane.move(40);
        plane.startingAngle(270);
        plane.move(5);
        plane.turn(-90);
        plane.move(100);

        //moving to E
        plane.isTrail=false;
        plane.startingAngle(270);
        plane.move(35);
        plane.startingAngle(180);
        plane.move(100);
        plane.isTrail=true;

        //letter E
        plane.startingAngle(0);
        plane.move(100);
        plane.turn(90);
        plane.move(40);
        plane.turn(180);
        plane.move(40);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-90);
        plane.move(40);
        plane.turn(180);
        plane.move(40);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-90);
        plane.move(40);


    }

}

    //yay the code is done


/* 

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/