# vue常用语法

### 1. 常用方法和变量

#### （1）`setup` 函数

`setup` 函数是Composition API的入口函数，用于定义组件的响应式变量和方法。在Vue 3中，你可以根据需要从Vue中导入特定的API，例如：

```
import { createApp } from 'vue';
import App from './App.vue';
createApp(App).mount('#app');
```

#### （2）响应式变量

Vue 3通过`ref`和`reactive`两个函数来定义响应式数据。这些响应式变量在数据变化时会自动更新视图。

- `ref`：用于定义基本类型的数据，如数字和字符串。例如：

  ```
  import { ref } from 'vue';
  const count = ref(0);
  ```

  `ref`返回一个包含`value`属性的对象，你可以通过`count.value`来访问和修改值。

- `reactive`：用于定义复杂类型的数据，如对象或数组。例如：

  ```
  import { reactive } from 'vue';
  const state = reactive({ count: 0 });
  ```

  `reactive`使得整个对象成为响应式的，你可以直接修改对象的属性，而不需要像`ref`那样通过`.value`来访问。

### 2. 监听和触发更新

Vue 3还允许你监听响应式变量的变化，并手动触发响应式更新。这可以通过`watch`和`watchEffect`来实现。

- `watch`：允许你监视一个或多个响应式数据源，并在数据变化时执行回调函数。例如：

  ```
  import { watch } from 'vue';
  watch(count, (newVal, oldVal) => {
    console.log(`count changed from ${oldVal} to${newVal}`);
  });
  ```

- `watchEffect`：立即执行一个函数，同时响应式地追踪其依赖，并在依赖变化时重新执行。例如：

  ```
  import { watchEffect } from 'vue';
  watchEffect(() => {
    console.log(count.value);
  });
  ```

### 3. 组合式 API（Composition API）

Vue 3 的一个主要特点是引入了 Composition API，它提供了一种更灵活的方式来组织和重用代码。以下是一些相关的 API：

- `computed`: 用于定义计算属性，这些属性会根据其依赖自动更新。

  javascript

  复制

  ```
  import { computed } from 'vue';
  const doubleCount = computed(() => count.value * 2);
  ```

- `toRefs` 和 `toRef`: 用于将响应式对象转换为单独的响应式引用，这在解构 `reactive` 对象时特别有用。

  javascript

  复制

  ```
  import { toRefs, reactive } from 'vue';
  const state = reactive({ count: 0, name: 'Vue' });
  const { count, name } = toRefs(state);
  ```

- `provide` 和 `inject`: 用于跨组件传递数据，无需通过props逐层传递。

### 4. 生命周期钩子

Vue 3 中的生命周期钩子也有所更新，支持 Composition API 的用法：

- `onBeforeMount`
- `onMounted`
- `onBeforeUpdate`
- `onUpdated`
- `onBeforeUnmount`
- `onUnmounted`

### 5. 组件

- `defineComponent`: 用于定义组件，它使得类型推断更加友好。

  javascript

  复制

  ```
  import { defineComponent } from 'vue';
  export default defineComponent({
    // 组件选项
  });
  ```

- `h`: 用于创建虚拟节点（VNodes），通常在`render`函数中使用。

### 6. v-model 更新

Vue 3 中 `v-model` 的用法有所更新，支持对组件的多个模型绑定，并且可以自定义 `v-model` 的修饰符。

### 7. 全局 API 和配置

- `globalProperties`: 用于添加全局属性，这些属性可以在所有组件实例中访问。

### 8. 性能优化

- `teleport`: 用于将子组件渲染到DOM的另一部分，而不改变组件的逻辑结构。
- `Suspense`: 用于等待嵌套组件渲染或异步组件加载，提供了一种处理加载状态的方式。