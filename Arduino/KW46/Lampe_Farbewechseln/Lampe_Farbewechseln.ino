// Deklaration und Initialisierung der Eingang-Pins
int JoyStick_X = 32; // X-Achse-Signal
int JoyStick_Y = 33; // Y-Achse-Signal
int Button = 3; // Knopf
 
void setup ()
{
  pinMode (JoyStick_X, INPUT);
  pinMode (JoyStick_Y, INPUT);
  pinMode (Button, INPUT);
   
  // Da der Knopf das Signal beim druecken auf Masse zieht,
  // schalten wir hiermit den PullUp-Widerstand ein
  digitalWrite(Button, HIGH);  
   
  Serial.begin (9600); // Serielle Ausgabe mit 9600 bps
}
 
// Das Programm liest die aktuellen Werte der Eingang-Pins
// und gibt diese auf der seriellen Ausgabe aus
void loop ()
{
  float x, y;
  int Knopf;
   
  //Aktuelle Werte werden ausgelesen, auf den Spannungswert konvertiert...
  x = analogRead (JoyStick_X) * (5.0 / 1023.0); 
  y = analogRead (JoyStick_Y) * (5.0 / 1023.0);
  Knopf = digitalRead (Button);
   
  //... und an dieser Stelle ausgegeben
  Serial.print ("X-Achse:"); Serial.print (x, 4);  Serial.print ("V, ");
  Serial.print ("Y-Achse:"); Serial.print (y, 4);  Serial.print ("V, ");
  Serial.print ("Knopf:");
 
  if(Knopf==1)
  {
      Serial.println (" nicht gedrueckt");
  }
  else
  {
      Serial.println (" gedrueckt");
  }
  delay (200);
}
