package info.passdaily.holy_angles_staff.lib.dashed_circle_progress.painter;

public interface ProgressPainter extends Painter {

    void setMax(float max);

    void setMin(float min);

    void setValue(float value);

}
