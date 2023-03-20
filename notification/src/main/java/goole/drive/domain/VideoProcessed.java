package goole.drive.domain;

import goole.drive.domain.*;
import goole.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String url;
}
