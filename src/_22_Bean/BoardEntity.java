package _22_Bean;

import java.time.LocalDateTime;

/*
 * 게시물 Entity
 * 게시물 id,제목,내용,닉네임,생성시각,수정시각
 * */
public class BoardEntity {
    private int id;
    private String title;
    private String content;
    private String nickName;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public LocalDateTime getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDateTime createDt) {
        this.createDt = createDt;
    }

    public LocalDateTime getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(LocalDateTime updateDt) {
        this.updateDt = updateDt;
    }

    @Override
    public String toString() {
        return "BoardEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", nickName='" + nickName + '\'' +
                ", createDt=" + createDt +
                ", updateDt=" + updateDt +
                '}';
    }
}
