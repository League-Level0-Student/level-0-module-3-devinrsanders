
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
  for (int i = 1; i < 10; i++) {
    
    if (i % 2 == 0) {
      fill(255, 0, 0);
    } else { 
    fill(0,0,0);
    }
      ellipse(300,300,300 - i * 30,300 - i * 30);
   
   
   
    
   
    
  }
  
}
