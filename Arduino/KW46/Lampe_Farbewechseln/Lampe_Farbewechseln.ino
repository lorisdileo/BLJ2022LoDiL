int Led_Rot = 33;
int Led_Gruen = 25;
int Led_Blau = 32;
  
void setup ()
{
  // Initialisierung Ausgangspins für die LEDs
  pinMode (Led_Rot, OUTPUT); 
  pinMode (Led_Gruen, OUTPUT);
  pinMode (Led_Blau, OUTPUT); 
}
  
void loop () //Hauptprogrammschleife
{
  digitalWrite (Led_Rot, HIGH); // LED wird eingeschaltet
  digitalWrite (Led_Gruen, LOW); // LED wird eingeschaltet
  digitalWrite (Led_Blau, LOW); // LED wird eingeschaltet
  delay (3000); // Wartemodus für 3 Sekunden
  
  digitalWrite (Led_Rot, LOW); // LED wird eingeschaltet
  digitalWrite (Led_Gruen, HIGH); // LED wird eingeschaltet
  digitalWrite (Led_Blau, LOW); // LED wird eingeschaltet
  delay (3000); // Wartemodus für weitere drei Sekunden in denen die LEDs dann umgeschaltet werden
   
  digitalWrite (Led_Rot, LOW); // LED wird eingeschaltet
  digitalWrite (Led_Gruen, LOW); // LED wird eingeschaltet
  digitalWrite (Led_Blau, HIGH); // LED wird eingeschaltet
  delay (3000); // Wartemodus für weitere drei Sekunden in denen die LEDs dann umgeschaltet werden
}
