public class Student {

    // 필든
    private final int id;
    private final String name;
    private int score;

    // 생성자
    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // 메소드
    // getID(), getName(), getScore(), updateScore(...), getPassStatus(), toString()

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void updateScore(int score) {
        this.score = score;
    }

    public PassStatus getPassStatus() {
        if (this.score >= 60) {
            return PassStatus.PASSED;
        } else {
            return PassStatus.FAILED;
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " | " + score + "점 | " + getPassStatus().getLabel();
    }
}

