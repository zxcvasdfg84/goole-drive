package goole.drive.domain;

import goole.drive.IndexerApplication;
import goole.drive.domain.FileIndexed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Index_table")
@Data
public class Index {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileid;

    @ElementCollection
    private List<String> keyword;

    @PostPersist
    public void onPostPersist() {
        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();
    }

    public static IndexRepository repository() {
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(
            IndexRepository.class
        );
        return indexRepository;
    }

    public static void indexFile(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        FileIndexed fileIndexed = new FileIndexed(index);
        fileIndexed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);

            FileIndexed fileIndexed = new FileIndexed(index);
            fileIndexed.publishAfterCommit();

         });
        */

    }
}
