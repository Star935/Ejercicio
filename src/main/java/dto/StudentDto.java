package dto;

public class StudentDto {
    private int id;
    private String name;
    private String email;
    private int semester;

    public StudentDto(int id, String name, String email, int semester) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.semester = semester;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getSemester() {
        return semester;
    }
}
