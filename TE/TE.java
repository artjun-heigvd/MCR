class Worm
{
  private int age;
  
  public Worm(int age) {
    this.age = age;
  }

  public int age() {
    return age;
  }

  public String toString() {
    return age + " years sandworm";
  }
}

class Person
{
  private final String name;
  private TypePerson typePerson;

  public Person(String name) {
    this.name = name;
    typePerson = new Fremen(this);
  }

  void setTypePerson(TypePerson typePerson){
    this.typePerson = typePerson;
  }

  public void drinkWaterOfLife(){
    typePerson.drinkWaterOfLife();
  }

  public void useSpice(int spice){
    typePerson.useSpice(spice);
  }

  public void callWorm(Worm worm){
    typePerson.callWorm(worm);
  }

  public String name() {
    return name;
  }

  public String toString() {
    return name + ": " + typePerson;
  }
}

abstract class TypePerson {
  protected Person person;

  protected TypePerson(Person person) {
    this.person = person;
  }

  protected TypePerson(TypePerson other) {
    this.person = other.person;
  }


  public abstract String toString();
  void callWorm(Worm worm){
    System.out.print(person.name() + " calls a " + worm + "... ");
  }
  void useSpice(int spice){
    System.out.println(person.name() + " uses the spice!");
  }
  void drinkWaterOfLife(){
    System.out.print(person.name() + " drinks the water of life... ");
  }
}

class Fremen extends TypePerson
{
  private int xp;

  Fremen(Person person) {
    super(person);
    xp = 0;
  }

  Fremen(TypePerson other) {
    super(other);
    xp = 0;
  }

  @Override
  public String toString() {
    return "A fremen (" + xp + ")";
  }

  @Override
  public void callWorm(Worm worm) {
    super.callWorm(worm);
      if(xp >= (worm.age()/10)){
        System.out.println("and rides it!");
        xp += worm.age()/20;
      }else{
        xp -= worm.age()/20;
        if(xp < 0){
          System.out.println("and dies!");
          person.setTypePerson(new Dead(this));
        }else{
          System.out.println("bad idea!");
        }
      }
  }

  @Override
  public void useSpice(int spice) {
    super.useSpice(spice);
    xp += spice;
  }

  @Override
  public void drinkWaterOfLife() {
    super.drinkWaterOfLife();
    if(xp >= 100){
      System.out.println("and ascends!");
      person.setTypePerson(new KwizatchHaderach(this));
    }else{
      System.out.println("and dies!");
      person.setTypePerson(new Dead(this));
    }
  }
}

class KwizatchHaderach extends TypePerson
{

  // Singleton ?

  KwizatchHaderach(TypePerson other) {
    super(other);
  }

  @Override
  public String toString() {
    return "The Kwisatz Haderach";
  }

  @Override
  public void callWorm(Worm worm) {
    super.callWorm(worm);
    System.out.println("and rides it!");
  }

  @Override
  public void useSpice(int spice) {
    super.useSpice(spice);
  }

  @Override
  public void drinkWaterOfLife() {
    super.drinkWaterOfLife();
    System.out.println("and rebecomes a fremen.");
    person.setTypePerson(new Fremen(this));
  }
}

class Dead extends TypePerson{

  protected Dead(TypePerson other) {
    super(other);
  }

  @Override
  public String toString() {
    return "Dead";
  }

  @Override
  void callWorm(Worm worm) {
    System.out.println(person.name() + " is dead and cannot do anything.");
  }

  @Override
  void useSpice(int spice) {
    System.out.println(person.name() + " is dead and cannot do anything.");
  }

  @Override
  void drinkWaterOfLife() {
    System.out.println(person.name() + " is dead and cannot do anything.");
  }
}

class TE
{
  public static void main(String ... args) {
    Worm
      s100 = new Worm(100),
      s5000 = new Worm(5000);

    Person
      paul = new Person("Paul"),
      john = new Person("John");


    System.out.println(john);
    john.useSpice(10);
    System.out.println(john);
    john.callWorm(s100);
    System.out.println(john);
    john.callWorm(s5000);
    john.drinkWaterOfLife();

    paul.useSpice(5);
    System.out.println(paul);
    paul.callWorm(s100);
    System.out.println(paul);
    paul.useSpice(100);
    System.out.println(paul);
    paul.drinkWaterOfLife();
    System.out.println(paul);
    paul.callWorm(s5000);
    System.out.println(paul);
    paul.drinkWaterOfLife();
    System.out.println(paul);
    paul.drinkWaterOfLife();
    System.out.println(paul);
  }
}

