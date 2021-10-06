
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
  for (int i = 1; i < 10; i++) {
    int circle = 100;
    while (circle > 1) {
   ellipse(300,300,circle,circle);
   circle--;
    }
   
    
  }
  
}
