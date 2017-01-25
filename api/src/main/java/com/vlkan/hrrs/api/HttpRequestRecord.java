package com.vlkan.hrrs.api;

import org.immutables.value.Value;

import javax.annotation.Nullable;
import java.util.List;

@Value.Immutable
public interface HttpRequestRecord {

    String getId();

    String getGroupName();

    long getTimestampMillis();

    String getUri();

    HttpRequestMethod getMethod();

    List<HttpRequestHeader> getHeaders();

    @Nullable
    HttpRequestPayload getPayload();

}
