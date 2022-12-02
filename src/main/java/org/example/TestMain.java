package org.example;

public class TestMain {

        public int taxEarningsSixPerCents(int earnings) {
            int tax1 = earnings * 6 / 100;

            if (tax1 >= 0) {
                return tax1;
            } else {
                return 0;
            }
        }

        public int taxEarningsMinusSpendings(int earnings, int spendings) {

            int tax2 = (earnings - spendings) * 15 / 100;

            if (tax2 >= 0) {
                return tax2;

            } else {
                return 0;
            }
        }

        public boolean notEquals(int a, int b) {
            if (taxEarningsSixPerCents(a) <= taxEarningsMinusSpendings(a, b)) {
                return true;
            } else return false;
        }
    }