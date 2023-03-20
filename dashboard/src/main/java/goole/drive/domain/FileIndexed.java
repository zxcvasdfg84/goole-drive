package goole.drive.domain;

import goole.drive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private String fileid;
    private List<String> keyword;
}
