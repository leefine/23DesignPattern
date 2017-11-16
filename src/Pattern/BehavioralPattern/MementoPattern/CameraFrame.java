package Pattern.BehavioralPattern.MementoPattern;

/**
 * 摄像机记录帧记录画面和声音
 */
public class CameraFrame {

    public CameraFrame(Actor actor) {
        this.perform = actor.getPerform();
        this.sound = actor.getSound();
    }

    private String perform;
    private String sound;

    public String getPerform() {
        return perform;
    }

    public void setPerform(String perform) {
        this.perform = perform;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
