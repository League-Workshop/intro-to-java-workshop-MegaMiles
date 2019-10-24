int x=345;
int y=299;
int x7=499;
int y7=309;
PImage catPic; 
void setup() {
  size(800, 800);
    catPic = loadImage("catcute.jpg");
  catPic.resize(width, height);
  background(catPic);
}
void draw() {
  fill(#FA0D4C);

  //background(catPic);
  if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
    ellipse(x, y, 109, 109);
    ellipse(x7, y7, 109, 109);
  }
}

void keyPressed() {
  x++;
  y++;
  x7--;
  y7--;
}
