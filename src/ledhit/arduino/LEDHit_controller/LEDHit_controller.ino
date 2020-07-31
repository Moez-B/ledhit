int pin = 8;

void setup() {
  pinMode(pin, OUTPUT);
  Serial.begin(9600);
  while(!Serial) {
    ;
  }
}

void loop() {
  if(Serial.available() > 0) {
    byte sent = Serial.read();
    if(sent != -1) {
      digitalWrite(pin, HIGH);
      delay(2000);
      digitalWrite(pin, LOW);
    }
  }

}
