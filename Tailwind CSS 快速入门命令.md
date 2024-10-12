# Tailwind CSS 

### 布局和宽高
- `w-{size}`: 设置宽度（例如：`w-1/2` 设置宽度为父元素的一半）。
- `h-{size}`: 设置高度（例如：`h-64` 设置高度为64px）。
- `min-w-{size}`: 设置最小宽度。
- `max-w-{size}`: 设置最大宽度。
- `min-h-{size}`: 设置最小高度。
- `max-h-{size}`: 设置最大高度。
### 间距（Padding 和 Margin）
- `p-{size}`: 设置内边距（padding）。
- `m-{size}`: 设置外边距（margin）。
- `pt-{size}`: 设置顶部内边距。
- `mt-{size}`: 设置顶部外边距。
- `px-{size}`: 设置左右内边距。
- `mx-{size}`: 设置左右外边距。
### flexbox 和 grid
- `flex`: 设置 `display: flex`。
- `flex-{direction}`: 设置 flex 方向（例如：`flex-row`）。
- `justify-{justify}`: 设置 flexbox 主轴对齐方式（例如：`justify-center`）。
- `items-{align}`: 设置 flexbox 交叉轴对齐方式（例如：`items-center`）。
- ##### 主轴（Main Axis）

  主轴是 flex 容器的主要布局方向。flex 项（flex children）沿着主轴被放置。主轴的方向可以通过 `flex-direction` 属性来设置，以下是 `flex-direction` 的可能值：

  - `row`（默认值）：主轴是水平的，从左到右。
  - `row-reverse`：主轴是水平的，从右到左。
  - `column`：主轴是垂直的，从上到下。
  - `column-reverse`：主轴是垂直的，从下到上。

  在主轴上，可以使用以下属性来对齐 flex 项：

  - `justify-content`：定义了 flex 项在主轴上的对齐方式（例如，`justify-content: center;` 将 flex 项居中对齐）。
  - `justify-items`：定义了 flex 项的单独对齐方式。
  - `justify-self`：定义了单个 flex 项的对齐方式。

  ##### 交叉轴（Cross Axis）

  交叉轴是垂直于主轴的轴。交叉轴的方向依赖于主轴的方向。例如，如果主轴是水平的（`row` 或 `row-reverse`），那么交叉轴就是垂直的；如果主轴是垂直的（`column` 或 `column-reverse`），那么交叉轴就是水平的。

  在交叉轴上，可以使用以下属性来对齐 flex 项：

  - `align-items`：定义了 flex 项在交叉轴上的对齐方式（例如，`align-items: center;` 将 flex 项在交叉轴上居中对齐）。
  - `align-content`：定义了多行 flex 项之间的空间分配和对齐方式。
  - `align-self`：定义了单个 flex 项在交叉轴上的对齐方式。
- `grid`: 设置 `display: grid`。
- `grid-cols-{number}`: 设置 grid 列的数量。
### 定位
- `static`: 设置 `position: static`。
- `relative`: 设置 `position: relative`。
- `absolute`: 设置 `position: absolute`。
- `fixed`: 设置 `position: fixed`。
- `sticky`: 设置 `position: sticky`。
### 文本
- `text-{size}`: 设置字体大小。
- `font-{weight}`: 设置字体粗细。
- `leading-{size}`: 设置行高。
- `tracking-{size}`: 设置字母间距。
- `text-{align}`: 设置文本对齐方式。
### 背景
- `bg-{color}`: 设置背景颜色。
- `bg-{size}`: 设置背景图片尺寸。
- `bg-{position}`: 设置背景图片位置。
- `bg-{repeat}`: 设置背景图片重复方式。
### 边框
- `border`: 设置边框。
- `border-{width}`: 设置边框宽度。
- `border-{color}`: 设置边框颜色。
- `rounded-{size}`: 设置边框圆角。
### 响应式
- `{screen}:class`: 在特定屏幕尺寸上应用类（例如：`md:text-lg` 在中等屏幕尺寸及以上时应用 `text-lg`）。
### 伪类和状态
- `hover:class`: 在鼠标悬停时应用类。
- `focus:class`: 在元素聚焦时应用类。
- `active:class`: 在元素激活时应用类。
- `group:hover:class`: 在一组元素中，当任何一个元素被悬停时应用类。
### 其他
- `opacity-{number}`: 设置透明度。
- `transition-{property}`: 设置过渡效果。
- `transform-{transform}`: 设置变换效果。
这些只是一小部分 Tailwind CSS 提供的类。Tailwind CSS 的文档非常全面，提供了所有可用类的详细列表和用法示例。