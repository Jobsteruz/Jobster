package com.smartbox.jobster.pojo.hh;

public class SimpleUserDTO {
    private String id;
    private String displayName;

    public SimpleUserDTO() {}

    public SimpleUserDTO(String id, String displayName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDisplayName() { return displayName; }
    public void setDisplayName(String displayName) { this.displayName = displayName; }
}
