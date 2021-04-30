public class Main {
    public static void main(String[] args) {
        BigNumber previous = new BigNumber();
        BigNumber next = new BigNumber();
        BigNumber total;

        previous.assignInteger(123);
        previous.assignInteger(250);
        System.out.println(previous.getNumberAsString());
        next.assignInteger(1250);
        previous.add(next);
        System.out.println(previous.getNumberAsString());

//        while (true) {
//            total = previous.add(next);
//            previous = previous.assign(next);
//            next = next.assign(total);
//
//            System.out.println(next);
//        }
//        previous_number = 1
//        new_number = 1
//        state = 2
//        sum = 0
//

//        while new_number >0 :
//        new_number += previous_number
//        previous_number = new_number - previous_number
//        state += 1
//
//        if new_number > ((10 ** 999) - 1):
//        break
//
//        print(state)

    }
}