/**
 * This file is part of Graylog.
 *
 * Graylog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog.plugins.pipelineprocessor.rest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;

import java.util.Set;

@AutoValue
@JsonAutoDetect
public abstract class PipelineReverseConnections {
    @JsonProperty
    public abstract String pipelineId();

    @JsonProperty
    public abstract Set<String> streamIds();

    @JsonCreator
    public static PipelineReverseConnections create(@JsonProperty("pipeline_id") String pipelineId,
                                                    @JsonProperty("stream_ids") Set<String> streamIds) {
        return new AutoValue_PipelineReverseConnections(pipelineId, streamIds);
    }
}
