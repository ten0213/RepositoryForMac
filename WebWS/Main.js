let app = {
    data() {
      return {
        quantity: 1,
        price: 150
      };
    },
    computed:  {
      total : {
        get() {
          return this.quantity * this.price;
        },
        set(value) {
          this.quantity = value / this.price;
        }
      }
    }
  };
  Vue.createApp(app).mount("#app");
