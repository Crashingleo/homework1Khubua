public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " " + cat + " " + paper);
        /* zadacha 2 */
        dog = dog + 3;
        cat = cat + 3;
        paper = paper + 3;

        System.out.println(dog + " " + cat + " " + paper);
        /* zadacha 3 */
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + " " + cat + " " + paper);
        /* zadacha 4 */
        var friend =19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        /* zadacha 5 */
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        /* zadacha 6 */
        var first = 78.2;
        var second = 82.7;
        var sum = first + second;
        var dif = second - first;
        System.out.println(sum + " - сумма веса бойцов");
        System.out.println(dif + " - разница веса бойцов");
        /* zadacha 7 */
         // dif -- разница веса бойцов//
        var anotherDif = first % second;
        System.out.println(anotherDif + " - разница веса");
        /* zadacha 8 */
        var hours = 640;
        var hoursPerMan = 8;
        var people = hours / hoursPerMan;
        System.out.println("Всего работников в компании — " + people + " человек");
        var morePeople = 94;
        people = people + morePeople;
        var newHours = people * hoursPerMan;
        System.out.println("Если в компании работает " + people + " человек, то всего " + newHours + " часов работы может быть поделено между сотрудниками");




    }
}