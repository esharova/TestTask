package phone;

import java.util.Date;

/**
 * Created by sharovahelene on 04.03.15.
 * Ответ на третье тестовое задание.
 *
 */
class SmartPhone {
    private String model;
    private Date date;
    private String revision;

    public SmartPhone(String model, Date date, String revision) {

        this.model = model;
        this.date = date;
        this.revision = revision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartPhone)) return false;

        SmartPhone that = (SmartPhone) o;

        if (!date.equals(that.date)) return false;
        if (!model.equals(that.model)) return false;
        if (!revision.equals(that.revision)) return false;

        return true;
    }

    /**
     * FIXME: Для одного и того же входного объекта hash code должен быть одинаков.
     * @return
     */
    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + revision.hashCode();
        return result;
    }

}
