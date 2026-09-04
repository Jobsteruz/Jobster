package com.smartbox.jobster.pojo.hh;

public class SimplePositionDTO {
    private String id;
    private String name;

    public SimplePositionDTO() {}

    public SimplePositionDTO(String id, String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
