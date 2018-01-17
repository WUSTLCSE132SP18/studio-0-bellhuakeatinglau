void setup() {
  Serial.begin(9600);
  pinMode(13, OUTPUT);
}


void loop() {
  delay(990);

  digitalWrite(13, HIGH);
  delay(10);
  digitalWrite(13, LOW);
  
  long n = millis()/1000;
  Serial.print(n);
  Serial.println(" seconds have elapsed");
}
