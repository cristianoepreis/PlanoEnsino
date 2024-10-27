package com.ufbra.sistemaescolar.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class DisciplinaAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDisciplinaAllPropertiesEquals(Disciplina expected, Disciplina actual) {
        assertDisciplinaAutoGeneratedPropertiesEquals(expected, actual);
        assertDisciplinaAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDisciplinaAllUpdatablePropertiesEquals(Disciplina expected, Disciplina actual) {
        assertDisciplinaUpdatableFieldsEquals(expected, actual);
        assertDisciplinaUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDisciplinaAutoGeneratedPropertiesEquals(Disciplina expected, Disciplina actual) {
        assertThat(expected)
            .as("Verify Disciplina auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDisciplinaUpdatableFieldsEquals(Disciplina expected, Disciplina actual) {
        assertThat(expected)
            .as("Verify Disciplina relevant properties")
            .satisfies(e -> assertThat(e.getNome()).as("check nome").isEqualTo(actual.getNome()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDisciplinaUpdatableRelationshipsEquals(Disciplina expected, Disciplina actual) {
        assertThat(expected)
            .as("Verify Disciplina relationships")
            .satisfies(e ->
                assertThat(e.getProfessorResponsavel()).as("check professorResponsavel").isEqualTo(actual.getProfessorResponsavel())
            )
            .satisfies(e -> assertThat(e.getCursos()).as("check cursos").isEqualTo(actual.getCursos()));
    }
}
