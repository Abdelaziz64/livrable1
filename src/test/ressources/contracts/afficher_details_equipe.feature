Feature: Afficher les détails d'une équipe

  Scenario: Afficher les informations d'une équipe existante
    Given l'utilisateur est authentifié
    And une équipe nommée "Les Étoiles" existe
    When il consulte les détails de l'équipe "Les Étoiles"
    Then les détails de l'équipe "Les Étoiles" sont affichés

