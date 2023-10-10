class person{

    String firstName;
    String lastName;
    int birthYear; 
    int birthMonth;
    int birthDay;

   public void printPerson(){
    System.out.println("Vezeténév"+firstName);
     System.out.println("útonév"+lastName);
      System.out.println("Születési idö"+birthYear+"."+birthMonth+"."+birthDay+".");
   }

public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}

public int getBirthYear() {
    return birthYear;
}

public int getBirthMonth() {
    return birthMonth;
}

public int getBirthDay() {
    return birthDay;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
}

public void setBirthMonth(int birthMonth) {
    this.birthMonth = birthMonth;
}

public void setBirthDay(int birthDay) {
    this.birthDay = birthDay;
}

   
}



