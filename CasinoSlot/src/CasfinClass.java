public class CasfinClass {


    // Member data
    private int membershipID[] = { 1, 2, 3, 4, 5 };
    private int currentPoints[] = { 1000, 1000, 1000, 1000, 1000 };
    private int lifeTimePoints[] = { 2000, 3000, 4000, 200, 200 };
    private int spinsPerMember[] = { 0, 0, 0, 0, 0 };
    private String membershipStatus;
    private int spinAmount = 0;


    public CasfinClass(int j, int i) {
            membershipID[i] = i;
            currentPoints[i] += j;
            lifeTimePoints[i] += j;
    }


    // methods
    public int displayPoint(int i) {
            return currentPoints[i];
    }


    public void addingPoints(int a, int i) {
            currentPoints[i] = currentPoints[i] + a;
            lifeTimePoints[i] = lifeTimePoints[i] + a;


    }


    public void deductingPoints(int a, int i) {
            currentPoints[i] = currentPoints[i] - a;
            lifeTimePoints[i] = lifeTimePoints[i] + a;


    }


    public String displayStatus(int i) {
            if (lifeTimePoints[i] >= 1000) {
                    membershipStatus = "Elite";
            }
            if (lifeTimePoints[i] < 1000) {
                    membershipStatus = "Regular";
            }
            return membershipStatus;
    }


    public int displayspinAmount(int i) {
            spinAmount = currentPoints[i] / 1000;
            spinsPerMember[i] = spinAmount;
            if (spinAmount < 1) {
                    spinAmount = 0;


                    System.out.print("not enough credits to spin ");
                    return spinAmount;
            } else {


                    return spinAmount;
            }
    }


    public void updateSpins(int i, int j) {
            spinsPerMember[i] = spinAmount + j;


    }
}
