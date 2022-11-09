package za.co.cc.food.entity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class FoodRepository {

    @Inject
    EntityManager em;

    @Transactional
    public void persist(Food food) {
        em.persist(food);
    }

    public List<Food> findAll() {
        return em.createNamedQuery(Food.FIND_ALL_FOOD, Food.class).getResultList();
    }
}
