package app.a2ms.dagger2.model;

import android.support.annotation.Nullable;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;

import org.threeten.bp.ZonedDateTime;

public class ZoneDateTimeAdapter {

    @FromJson
    ZonedDateTime fromJson(String json) {
        return ZonedDateTime.parse(json);
    }

    @ToJson
    String toJson(@Nullable ZonedDateTime value) {
        return value != null ? value.toString() : null;
    }
}