1. What is a one-to-one relationship in Hibernate?
Answer: A one-to-one relationship in Hibernate is a type of association where one entity is associated with exactly one instance of another entity. This relationship can be represented using the @OneToOne annotation.

2. How do you implement a one-to-one relationship using Hibernate annotations?
Answer: You can implement a one-to-one relationship using the @OneToOne annotation.

3. What are the different ways to implement a one-to-one relationship in Hibernate?
Answer: The different ways to implement a one-to-one relationship in Hibernate are:

Using a Foreign Key: Use @OneToOne and @JoinColumn to specify the foreign key.
Using a Shared Primary Key: Use @PrimaryKeyJoinColumn to share the primary key between two tables.
Using @MapsId: Use @MapsId to map the primary key of the child entity to the primary key of the parent entity.
4. What is the mappedBy attribute in the @OneToOne annotation?
Answer: The mappedBy attribute is used to specify the owning side of the relationship. It indicates that the foreign key is managed by the other entity. For example, in the Question entity, mappedBy = "question" indicates that the Answer entity owns the relationship.

5. How do you handle cascading in a one-to-one relationship?
Answer: Cascading is handled using the cascade attribute in the @OneToOne annotation. For example, cascade = CascadeType.ALL means that all operations (persist, merge, remove, etc.) will be cascaded to the associated entity.

6. What is the difference between @OneToOne and @ManyToOne annotations?
Answer: The @OneToOne annotation defines a one-to-one relationship, where each instance of an entity is associated with a single instance of another entity. The @ManyToOne annotation defines a many-to-one relationship, where multiple instances of an entity can be associated with a single instance of another entity.

7. How do you configure a one-to-one relationship using XML configuration?
Answer: In XML configuration, you define the one-to-one relationship in the mapping file. as above code

8. What are the advantages and disadvantages of using a shared primary key for a one-to-one relationship?
Answer: Advantages:

Ensures a strict one-to-one relationship.
Simplifies the schema by using a single primary key.
Disadvantages:

Can be less flexible if the relationship changes.
Requires careful management of primary keys.
9. How do you fetch data in a one-to-one relationship?
Answer: Data in a one-to-one relationship can be fetched using eager or lazy loading. Eager loading fetches the associated entity immediately, while lazy loading fetches it on demand. You can specify the fetching strategy using the fetch attribute in the @OneToOne annotation.

10. Can you explain the concept of bidirectional and unidirectional one-to-one relationships?
Answer:

Bidirectional: Both entities are aware of the relationship. Each entity has a reference to the other.
Unidirectional: Only one entity is aware of the relationship. Only one entity has a reference to the other.
11. What are some common issues you might encounter with one-to-one mappings in Hibernate?
Answer: Common issues include:

Null references if the associated entity is not properly initialized.
Improper cascading leading to orphaned records.
Performance issues due to improper fetching strategies.
12. How do you handle orphan removal in a one-to-one relationship?
Answer: Orphan removal is handled using the orphanRemoval attribute in the @OneToOne annotation. For example, orphanRemoval = true ensures that the associated entity is removed when it is no longer referenced.

These questions and answers should help you prepare for interviews related to one-to-one mappings in Hibernate. If you need more detailed explanations or have other questions, feel free to ask
