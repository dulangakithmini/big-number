import java.util.ArrayList;
import java.util.List;

public class BigNumber {
    private List<Integer> digitList;

    public BigNumber() {
        this.digitList = new ArrayList<Integer>();
    }

    public void assignInteger(int number) {
        this.digitList.clear();
        int digit = 0;
        int remainingNumber = 0;

        while(number>0) {
            digit = number%10;
            remainingNumber = number/10;
            number = remainingNumber;
            this.digitList.add(digit);
        }
    }

    public void assignBigNumber(BigNumber otherBigNumber) {
        this.digitList.clear();
        this.digitList.addAll(otherBigNumber.digitList);
    }

    public void add(BigNumber otherBigNumber) {
        int carry = 0;

        for (int i=0; i<digitList.size(); i++) {
            int rawSum = carry + this.getDigitAtIndex(i, 0) + otherBigNumber.getDigitAtIndex(i, 0);
            this.digitList.set(i,((rawSum)%10));
            carry = (rawSum)/10;
        }
    }

    public String getNumberAsString() {

        String digitListString = "";

        for (int s : digitList) {
            digitListString += s;
        }
        return digitListString;
    }

    public Integer getDigitAtIndex(int index, Integer valueIfInvalid) {
        if(index >= this.digitList.size()) {
            return valueIfInvalid;
        }else{
            return this.digitList.get(index);
        }
    }
}