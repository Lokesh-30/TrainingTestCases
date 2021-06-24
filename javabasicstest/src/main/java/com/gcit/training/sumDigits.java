package com.gcit.training;

public class sumDigits {
	public long sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;

}
}