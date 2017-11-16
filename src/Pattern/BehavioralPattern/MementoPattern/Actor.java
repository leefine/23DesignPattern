package Pattern.BehavioralPattern.MementoPattern;

/**
 * 演员 表演和对话
 */
public class Actor {

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


    public CameraFrame createCameraFrame() {
        return new CameraFrame(this);
    }

    //回放查看某一时刻的表演
    public void getStateFromCamera(CameraFrame cameraFrame) {
        this.setPerform(cameraFrame.getPerform());
        this.setSound(cameraFrame.getSound());
    }
}
