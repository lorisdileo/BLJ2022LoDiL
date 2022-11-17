#include <Adafruit_AHTX0.h> 
#include <Wire.h> 
#include <Adafruit_GFX.h> 
#include <Adafruit_SSD1306.h> 
Adafruit_AHTX0 aht; 
Adafruit_SSD1306 display(128, 64, &Wire, -1); 

void setup() { 
  Serial.begin(115200); 
  Serial.println("AHT10 + SSD1306 Demo"); 
  
  if(!aht.begin()) { 
    Serial.println("AHT10 allocation failed"); 
    while(1) delay(10); 
  } 
  
  if(!display.begin(SSD1306_SWITCHCAPVCC, 0x3C)) { 
    Serial.println("SSD1306 allocation failed"); 
    while(1) delay(1); 
  } 
  
  display.clearDisplay(); 
  display.setTextSize(2); 
  display.setTextColor(WHITE); 
  
  Serial.println("Setup complete"); 
} 

void loop() { 
  sensors_event_t humidity, temp; 
  aht.getEvent(&humidity, &temp); 
  
  display.clearDisplay(); 
  display.setCursor(0, 0); 
  display.print(temp.temperature); display.println(" degC"); 
  display.println("----------"); 
  display.print(humidity.relative_humidity); display.println("% rH"); 
  
  display.display(); 
  delay(500);
}