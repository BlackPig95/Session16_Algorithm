package baitap.entity;

public class Student implements Comparable<Student>
{
    private int id;
    private String name;
    private double score;

    public Student()
    {
    }

    public Student(int id, String name, double score)
    {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getScore()
    {
        return score;
    }

    public void setScore(double score)
    {
        this.score = score;
    }

    @Override
    public int compareTo(Student o)
    {
        return Double.compare(this.score, o.score);//Điểm giảm dần
    }
}
