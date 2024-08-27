package au.org.aodn.ogcapi.server.core.model;

import au.org.aodn.ogcapi.server.ardc.model.ParameterVocabModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArdcVocabModel {
    // properties are extendable (e.g platformVocabs, organisationVocabs etc.), currently just parameterVocabs.
    @JsonProperty("parameter_vocab")
    ParameterVocabModel parameterVocabModel;
}
