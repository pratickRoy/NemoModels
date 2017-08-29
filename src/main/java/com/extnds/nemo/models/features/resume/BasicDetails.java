package com.extnds.nemo.models.features.resume;

import com.extnds.nemo.models.commons.constraints.mobile.Mobile;
import com.extnds.nemo.models.features.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.validator.constraints.URL;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@AllArgsConstructor
public class BasicDetails extends BaseModel {

    @AllArgsConstructor
    @Getter
    private static class ExternalLinks {

        @NotNull
        private final String linkName;

        @NotNull
        @URL
        private final String linkUrl;
    }

    @NotNull
    private final String firstName;

    @NotNull
    private final String lastName;

    @NotNull
    private final String workProfile;

    @NotNull
    @Mobile
    private final String mobile;

    @NotNull
    @Email
    private final String emailAddress;

    @Valid
    private final List<ExternalLinks> links;
}
