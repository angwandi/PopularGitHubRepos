package app.a2ms.dagger2.details;

import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;

import java.util.List;

import app.a2ms.dagger2.model.Contributor;

@AutoValue
abstract class ContributorState {

    static Builder builder() {
        return new AutoValue_ContributorState.Builder();
    }

    abstract boolean loading();

    @Nullable
    abstract List<Contributor> contributors();

    @Nullable
    abstract Integer errorRes();

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder loading(boolean loading);

        abstract Builder contributors(List<Contributor> contributors);

        abstract Builder errorRes(Integer errorRes);

        abstract ContributorState build();
    }
}