Feature: Supprimer une équipe

  Scenario: Supprimer une équipe existante
    Given l'utilisateur est authentifié
    And une équipe nommée "Les Étoiles" existe
    When il supprime l'équipe "Les Étoiles"
    Then l'équipe "Les Étoiles" est supprimée avec succès

