# `WebLog`博客网站

## 项目介绍

> ​	每个技术人都应该有属于自己的博客！相比较直接使用第三方博客平台，自行搭建博客更有成就感；没有平台限制,还有可以自由 `div` 定制自己想要的博客 `css` 样式.

## 项目演示

<video src="https://qiccc-weblog.oss-cn-beijing.aliyuncs.com/video/%E6%BC%94%E7%A4%BA%E8%A7%86%E9%A2%91.mp4"></video>
[演示视频链接](https://qiccc-weblog.oss-cn-beijing.aliyuncs.com/video/%E6%BC%94%E7%A4%BA%E8%A7%86%E9%A2%91.mp4)

[观看视频](https://qiccc-weblog.oss-cn-beijing.aliyuncs.com/video/%E6%BC%94%E7%A4%BA%E8%A7%86%E9%A2%91.mp4)

### 项目目标

> 1. 掌握独立开发全栈项目的能力（*后端 + 前端*）；
> 2. 掌握 `Spring Boot` 相关技术栈，以及构建后端项目能力，写出符合企业级的代码规范；
> 3. 掌握 `Vue 3.x` + `Element Plus + Vite 4` 技术构建前端工程的能力，并能够手动搭建 `Admin` 后台管理系统；
> 4. 掌握前端页面响应式设计（同时适配不同屏幕），排版布局，能够根据自己需求，`div` 自己想要的前端效果；
> 5. 能够独立完成整个网站的部署流程，从本地功能开发，功能测试，再到部署到云服务器上、域名选购、网站备案，最终公网可访问；

### 技术亮点

> - 在技术选型上，选择了目前主流热门的技术栈，对标企业级项目开发；
> - 严格把控代码质量，数据库设计，写出高效简介的代码；
> - 熟悉后端工程的搭建，如一些通用的基础设施：参数校验、全局异常捕获、`API` 统一出入参日志打印等等；
> - 能够独立完成整个网站的部署流程，从本地功能开发，功能测试，再到部署到云服务器上、域名选购、网站备案，最终公网可访问；
> - 对象存储 `阿里云oos` 的使用, 能够独立搭建个人图床；
> - 从 0 到 1 ，通过 `Element Plus` 纯手搭 `Admin` 管理后台前端骨架；

### 结构插件介绍

> 搭建 Spring Boot 多模块工程骨架:`weblog-springboot`为父模块,
>
> 1. `weblog-web` 模块，此模块是项目的入口，Maven 打包的打包插件放在这里，同时，和博客前台页面展示相关的功能也统一放在此模块下;
> 2. `weblog-module-admin` 模块: 一个负责 `Admin` 管理后台功能的子模块，此模块用于统一放置和 `Admin` 管理后台相关的功能;
> 3. `weblog-module-common` 模块:此模块专门用于存放一些通用的功能，如接口的日志切面、全局异常管理等等;
> 4. `weblog-module-jwt`模块 : 此模块负责`admin`的身份认证和信息校验,博客前台可以被任何人访问,所以不对前台做身份校验;

- 插件与基本工具类配置
  1. `Lombok` 是一个超酷的 Java 库 : **避免编写那些冗余的 Java 样板式代码**，如对象中的 `get`、`set`、`toString` 等方法，解放双手，堪称偷懒神器;
  2. `Logback` 是日志框架 SLF4J 的一个实现 : **日志可以帮助我们监控、调试和跟踪代码的运行情况**`Logback` 提供了更高的性能，更丰富的日志功能和更好的配置选项;
  3. 使用jackson库对数据进行转换json格式处理,使响应数据更容易操作与阅读.
  4. 自定义注解 : 实现 `API` 请求日志切面,可以为所有使用 `@ApiOperationLog` 注解的方法自动添加日志逻辑，而不需要在每个方法中手动添加
  5. `MDC` 实现日志追踪功能 : ***为每个请求分配一个唯一的标识，并将该标识添加到每条日志消息中，从而方便地区分和跟踪每个请求的日志*;**
  6. `JSR 380` 参数校验注解 : 该规范定义了一系列注解，用于验证 `Java Bean` 对象的属性，确保它们满足某些条件或限制。**使用注解来为实体类参数上方之间添加参数校验.**
  7. 实现全局异常管理 : 在没有全局异常管理的情况下，每个控制器或 `service` 服务中可能都会有各种 `try-catch` 代码块来捕获和处理异常。避免**代码重复;不一致的响应格式;增加维护成本 ;可读性差;**
  8. 整合 `Mybatis Plus` : **快速开发**：`MyBatis Plus` 提供了一系列的便捷功能，如自动生成 SQL 语句、通用 Mapper 等，使数据库操作更加高效，能够节省开发时间。**更少的配置**： Spring Boot 已经为我们提供了很多默认的配置，整合 MyBatis Plus 时只需少量的配置，减少了繁琐的配置步骤。
  9. 整合p6spy 组件 : 一方面可以了解到每个操作都具体**执行的什么 `SQL` 语句**， 另一方面通过**打印执行耗时**，也可以提前发现一些慢 `SQL`，提前做好优化;
  10. 整合 Spring Security : 作为 Spring 框架的一部分，Spring Security 提供了强大的功能，帮助开发人员实现**身份认证、授权、会话管理以及其他与安全**相关的任务。
  11. 整合 `JWT` ：实现身份认证 : `JWT（JSON Web Token）`是一种用于在不同应用之间安全传输信息的开放标准（RFC 7519）。它是一种基于 `JSON` 的轻量级令牌，由三部分组成：头部（Header）、载荷（Payload）和签名（Signature）。`JWT` 被广泛用于实现身份验证和授权，**特别适用于前后端分离的应用程序**。当用户名、密码输入正确时，返回 Token 令牌，否则提示错误信息。
  12. `JWT` ：实现接口鉴权 : 在现代的 Web 应用程序中，接口鉴权是一个重要的安全考虑因素。**通过接口鉴权，您可以确保只有经过身份验证和授权的用户能够访问特定的接口和资源。**我们通过 `Spring Security + JWT` 已经实现了用户认证功能，新增后端程序中拿到令牌，对接口进行鉴权，若令牌正确，则可正常访问接口资源，否则提示对应错误信息。
  13. 阿里云`oos` : 存储图片上云
  14.  

- 前端搭建整合组件和`css`库

  1. 整合 `vue-router` 路由管理器 :  `Vue Router` 是 `Vue.js` 官方提供路由管理器。在一个标准的单页面应用中，**仅有一个 HTML 页面被服务器发送到客户端**。随后的页面内容都是通过 `JavaScript` 动态替换生成的。这时候，就需要 `Vue Router` 来管理这些页面的导航和组织。
  2. Vite 配置路径别名 : `alias` 是一个用于定义路径别名的配置选项。当你的项目结构变得复杂时，**路径别名可以帮助你简化 `import` 或 `require` 语句中的路径**，让代码更干净、更可维护。
  3. 整合 `Tailwind CSS` : `Tailwind CSS` 是一个高度可定制的、实用工具优先的 CSS 框架，它使你能够通过组合小型、单一用途的类来构建现代网站界面，**而无需写任何 CSS**。`Tailwind CSS` 在生产环境中会**自动移除未使用的样式，这有助于保持 CSS 文件大小最小**。
  4. 组件库：`Flowbite` : `Flowbite` 是一个基于 `Tailwind CSS` 创建的组件库，旨在帮助开发者**快速构建现代、响应式的 Web 应用界面。**
  5. Element Plus 组件库 : Element Plus 是一个专为 `Vue 3` 设计的 UI 组件库。它提供了一整套丰富且高质量的组件，从基本的按钮和输入框到复杂的日期选择器和数据表格。这些组件不仅样式美观，而且具有广泛的定制选项。**同时，它也是目前企业级 `Admin` 管理后台中，使用广度非常高的一个组件框架。**
  6. `Animate.css` 添加入场动画 : `Animate.css` 是一个跨浏览器的 `CSS` 动画库，**提供了许多预设的、流畅的动画效果。用户只需添加几个 `CSS` 类名，就可以轻松实现复杂的动画效果**，无需编写任何 `JavaScript` 代码。
  7. 整合 `Axios` 实现登录功能（解决跨域问题) : 

  ### 登录模块开发

  1. #### 登录页设计：支持响应式布局 :

     **基本布局** : 首先，我们通过 Tailwind 的 `grid` 网格布局，实现一个登录页面的基本骨架，分为左边栏和右边栏

     1. 右边栏登录表单 : 引入了 Element Plus 表单组件 , 并添加了两个输入框和一个登录按钮,美化组件上方文字

     2. ![image-20241023192612557](./assets/image-20241023192612557.png)

     3. 左边栏登录设计  : 添加了一些描述性的文字，以及一张背景色透明的图片

     4. ![image-20241023192635915](./assets/image-20241023192635915.png)

        

  2. ##### 通过 `Animate.css` 给登录页添加入场动画

     1. 让页面过渡更加友好 : 添加弹跳动画 ,给右边栏的父级 `div` 添加 `bounceInRight`,同理给左边`div`添加向右弹跳动画.

  3. ##### `p6spy` 组件打印完整的 SQL 语句、执行耗时

     1. 一方面可以了解到每个操作都具体执行的什么 `SQL` 语句， 另一方面通过打印执行耗时，也可以提前发现一些慢 SQL
     2. 添加`applcation-prod.yml`配置文件,区分开发环境和上线环境

  4. ##### Spring Security 整合 `JWT` 

     1. **灵活性** : `JWT` 可以存储任意格式的数据，使其成为传递用户信息、权限、角色等的理想选择。
     2. **安全性**：`JWT` 使用签名进行验证，确保信息在传输过程中不被篡改。
     3. **`PasswordEncoder` 密码加密**  : 在系统中，安全存储用户密码是至关重要的。使用明文存储密码容易受到攻击，因此使用密码加密技术来保护用户密码是必不可少的。
     4. **使用 `BCrypt` 算法对密码进行加密**。`BCrypt` 是一种安全且适合密码存储的哈希算法，它在进行哈希时会自动加入“盐”，增加密码的安全性。
     5. **实现接口鉴权** : 通过 `Spring Security` + `JWT` 已经实现了用户认证功能，当用户名、密码输入正确时，返回 Token 令牌，否则提示错误信息。将在后端程序中拿到此令牌，对接口进行鉴权，若令牌正确，则可正常访问接口资源，否则提示对应错误信息。

  5. ##### `Axios` 实现跨域问题

     1. `Axios` 是一个流行的用于发起 `HTTP` 请求的 `JavaScript` 库。它可以在浏览器和 `Node.js` 环境中使用，提供了一种简洁且强大的方式来处理异步网络请求。
     2. 整合 `Axios` 并调用登录接口，当登录成功后，跳转后台首页的功能就完成了.

  6. ##### 登录页表单验证

     1. 除了后端要校验外，前端也需要校验，并给予用户友好的提示信息。
     2. `Element Plus` 提供的 Form 组件允许你验证用户的输入是否符合规范，来帮助你找到和纠正错误。只需为 `rules` 属性传入约定的验证规则，并将 `form-Item` 的 `prop` 属性设置为需要验证的特殊键值即可.![image-20241030152605943](./assets/image-20241030152605943.png)

  7. ##### 回车键监听

     1. **交互做的好一点** ,当输入完用户名、密码后，直接敲击回车键就能完成登录了。
     2. 引入了 `onMounted` 、`onBeforeUnmount` 生命周期方法，然后在 `onMounted()` 方法中添加了键盘监听事件，当键盘的 `key` 值为 `Enter` 时，也就是回车键时，直接调用 `onSubmit()` 登录。然后在 `onBeforeUnmount()` 生命周期方法中，移除了键盘监听事件。

  8. ##### 按钮加载

     1. 当触发登录后，会调用后台接口，网络 IO 可能会消耗一点时间，为了给用户一个友好的提示，显示加载 Loading 非常有必要
     2. Element Plus 提供的按钮组件提供了加载属性 `loading`, 通过设置为 `true` 或者 `false` 来决定是否要显示加载状态。上述代码中，声明了一个响应式的变量 `loading`, 在请求登录接口的开始，将其设置为了 `true`, 然后请求结束后，将其设置为 `false`, 恢复正常样式。

     ![image-20241029152109497](./assets/image-20241029152109497.png)

  9. ##### 存储 Token 到 Cookie 中

     1. `Cookie`是一种用于在客户端和服务器之间传递信息的小型文本文件。它通常由服务器发送给用户的浏览器，然后浏览器将这些信息存储在用户的计算机上，以备将来的使用.
     2. 使用`VueUse` 工具库简化js操作开发,其中`useCookies` 提供了一些 `API` ，用于操作 `Cookie`

     ![image-20241029152309347](./assets/image-20241029152309347.png)

  10. ##### 密码框显示明文小眼睛

      1. 密码框输入密码，默认都是点点点这种密文形式，为了保护数据的安全性，不对用户可见的，
      2. 但是，比较好的交互模式是，用户可手动设置密码可见
      3. ![image-20241023200514424](./assets/image-20241023200514424.png)
      4. `Element Plus` 提供的密码框组件默认提供了此功能，只需添加 `show-password` 属性即可得到一个可切换显示隐藏的密码框。

  11. ##### 重复登录问题

      1. 当用户成功登录后，再次访问登录页时，你会发现依然可以访问，这样就会导致用户*重复登录*的问题。*正确的逻辑应该是，当用户已经登录，则跳转后台首页*。
      2. 在路由的前置守卫中,新添加了一个 `else if` 判断，单独对当 `Token` 令牌不为空，也就是用户已登录，且访问登录页的情况，提示用户*请勿重复登录*，并强制跳转到后台首页。

      ![image-20241029152339646](./assets/image-20241029152339646.png)

### `admin`模块开发

1. #### 后台管理主布局分析

   1. **左侧导航栏**：也是功能菜单栏，点击后，内容区域会展现不同的页面，如文章管理列表等；
   2. **顶部栏**：通常用于显示用户是否登录、以及其它一些功能，如全屏展示、白天黑夜效果、语言国际化等；
   3. **标签导航栏**：每次打开一个新的页面，标签导航栏内就会动态新增一个标签，点击标签可来回切换页面；
   4. **内容区域**：根据当前路由动态渲染不同的内容页；
   5. **Footer 页脚** ：展示一些页脚信息，如 `Copyright` 版权信息等。

   ![image-20241029161718061](./assets/image-20241029161718061.png)

2. ##### 填充`AdminHeader.vue` 组件的内容

   1. **边距问题** : 头部左右有边距,通过 *`F12`* 审查元素，发现是 `Element Plus` 组件样式导致的 , 重写 `.el-header` 选择器，将 `padding` 设置为 0：
   2. **分析布局**  : 如下，分为左侧点击收缩菜单栏图标，以及右侧用户头像下拉框、全屏图标![image-20241029162229630](./assets/image-20241029162229630.png)
   3. **样式冲突** : 为了不让 `Element Plus` 内部的样式覆盖 `Tailwind CSS` 的样式，需要用一层 `<div>` 将包裹起来
   4. **添加 `Tooltip` 文字提示** : 当鼠标移动到某个区域，也是是 `hover` 时的提示信息，Element Plus 提供了响应的组件以供使用 ![image-20241029162442541](./assets/image-20241029162442541.png)

3. #### 填充 Menu 菜单栏

   1. **布局分析** : 左侧栏的布局结构，分为两个部分：上面的 Logo 图片, 下面的菜单栏；![image-20241029162920223](./assets/image-20241029162920223.png)

   2. **结构调整** : 使用**Element Plus Menu** 菜单组件,因为是博客系统，没有复杂的二级菜单、三级菜单，所以*只需保留一级菜单即可*。精简一下菜单代码;

   3. **Logo 制作** : 制作了一张背景透明的 Logo 图片，格式为 `*PNG*`;![image-20241029164101564](./assets/image-20241029164101564.png)

   4. **菜单栏数据** : 在 `<script>` 标签中定义个 `menus` 数组，包含以下属性：

      - `name` : 菜单名称；

      - `icon` : 菜单图标；
      - `path` : 菜单对应的路由；

   5. **路由跳转** : 点击不同的菜单，内容区域应该能渲染对应路由的页面, 为 `<el-menu>` 组件添加 `@select` 选择事件, 还需在 `/router/index.js` 中声明好对应的路由

   6. **整合`Pinia`** : `Pinia` 是一个强大状态管理库，可以帮助更好地管理和组织应用程序的状态。通过创建 `store`，可以轻松地将状态逻辑封装在一个地方，然后在组件中使用它。

   7. **左边菜单栏点击收缩、展开功能实现** : 

      - **添加 Icon 的点击事件** : 为 `AdminHeader` 组件中的收缩 `Icon` 添加点击事件
      - **动态设置菜单栏的宽度** : 引入 `useMenuStore` , 有了它就可以拿到全局状态中的菜单宽度了。然后，为菜单最顶层的 `<div>` 容器绑定了动态样式 `:style="{ width: menuStore.menuWidth }"` , 这样就可以响应式的设置菜单的 `CSS` 宽度值了;![image-20241029163953748](./assets/image-20241029163953748.png)![image-20241029164012380](./assets/image-20241029164012380.png)

   8. **支持全屏展示** :`VueUse` 这个工具集合中就包含了这个功能库。引入核心包中的 `useFullscreen` ，然后拿到了它提供的 `isFullscreen` 变量，它被用于记录当前是否处于全屏；还有一个 `toggle` 方法![image-20241029164322026](./assets/image-20241029164322026.png)

4. #### 标签导航栏组件实现

   1. **布局分析** : 需要的是一个左右布局,

      ①：左侧栏是标签导航栏；

      ②：右侧是一个下拉菜单，鼠标悬浮其上，会弹出菜单，以供用户关闭标签页；![image-20241029164613191](./assets/image-20241029164613191.png)

   2. **实现基本布局** : 使用 `Element Plus` 官方提供了 `Tabs` 标签页来实现

   3. **收缩左侧菜单，标签导航栏未跟随** : 当我们点击收缩左侧菜单栏，标签栏由于设定了 `left: 250px` , 这个值是写死的;解决这个问题也比较简单，使用 `Pinia` 的全局状态;

   4. **点击左侧栏菜单，无法动态添加 tab 标签页** : 引入了 `vue-router` 中的 `onBeforeRouteUpdate` 路由生命周期钩子，在 `onBeforeRouteUpdate` 路由生命周期钩子中，先是设置了需要被激活的 `tab` 标签，然后调用了 `addTab()` 方法来动态添加标签页。

   5. **刷新页面，标签页消失** : 打开了几个标签页后，再刷新页面，发现标签页都消失了。原因是标签页的数据没有被存储起来，就好像登录模块中，登录后需要存储 `token` 令牌一样

5. ####  填充 Footer 页脚

   1. **添加页脚样式布局** : 后台管理页面骨架还差最后一块拼图：***Footer 页脚***。因为页脚只涉及样式布局，并没有任何的 `js` 功能代码，所以非常简单。
   2. 最终效果，如下图所示，可以看到只是一些版权信息的展示, 用于上线之后放置备案信息![image-20241029170144337](./assets/image-20241029170144337.png)

### 文章分类模块开发

1. #### 分类模块接口分析

   1. **分类新增接口** : 当我们进入分类管理页面，点击新增按钮时，可以新增博客文章归属的分类，如下图所示：![image-20241030152717202](./assets/image-20241030152717202.png)

   2. **分类数据分页接口** : 能够查询出博客分类的分页数据，支持按条件搜索，如按分类名称的模糊查询、按创建时间段查询。如图所示:

      ![image-20241030152751130](./assets/image-20241030152751130.png)

   3. **分类删除接口** : 能够根据自己的需要，删除指定的分类：![image-20241030152823287](./assets/image-20241030152823287.png)

   4. **获取所有分类数据的下拉列表接口** : 这个接口主要在博客发布的时候需要，当想添加新的文章时，需要勾选该文章所属的分类：本章节中用不到此接口，我们先分析出来,后续再补充功能

2. #### 新增接口开发

   1. **添加分类表** : 分类表设计如图所示:

      ![image-20241030153438983](./assets/image-20241030153438983.png)

   2. **添加表对应的 DO 类** : 在 `weblog-module-common` 模块中的 `/domain/dos` 包下，创建 `CategoryDO` 实体类，字段与表中字段一一对应;

   3. **新建 `mapper`** : 在 `/domain/mapper` 包下，创建 `CategoryMapper` 接口;

   4. **添加入参 `VO` 实体类** : 在`weblog-module-admin` 子模块，在 `vo` 包下，新增 `category` 包;

   5. **添加分类 service 业务类** : 在 `/service/impl` 包下，创建此接口的实现类 `AdminCategoryServiceImpl`

   6. **添加 controller** : 在 `/controller` 包下，创建 `AdminCategoryController` 分类控制器

3. #### 分页接口开发

   1. **分页查询简述**  :  分页查询就是把**需要查询的数据集进行分批展示**，比如商品表中有 1万 条手机数据，每页按固定数量展示。分页接口允许客户端应用程序从服务器端获取数据的一个部分（即一页），而不是一次性获取所有数据。

   2. **分页接口关键参数：**

      1. **页码（Page Number）**：表示用户希望获取的页数。通常从第一页开始递增，用户可以选择跳转到不同的页码以获取不同的数据集。
      2. **每页数据数量（Page Size）**：表示每一页包含的数据记录数量。用户可以设置每页显示多少条数据，这个值通常由用户自行选择或者由应用程序默认设定。
      3. **总记录数（Total Records）**：表示整个数据集中的总数据记录数量。这个值通常用于计算总共有多少页数据可供分页使用。

   3. **分页接口的好处 :** 

      1. **性能优化**：对于大型数据集，一次性加载全部数据可能会导致网络请求变得非常慢，消耗大量的带宽和服务器资源。分页可以降低单次请求的数据量，提高数据的加载速度和性能。
      2. **用户体验**：分页允许用户在大数据集中浏览数据，而不会被一大堆数据淹没。用户可以根据自己的需求轻松浏览不同页的数据，提供了更好的用户体验。
      3. **服务器资源管理**：分页可以帮助服务器更好地管理资源。服务器只需提供客户端请求的那一部分数据，而不需要一次性加载整个数据集，从而减轻了服务器的负担。
      4. **数据传输成本**：对于移动应用或者有限带宽的网络环境，减少一次性传输的数据量可以降低数据传输成本。

   4. **开始开发分页接口** 

      1. **定义接口出入参 `JSON` 格式** : 

         1. **入参 `JSON` 格式**：

            ```json
            {
              "current": 1, // 要查询的页码
              "size": 10, // 每页要展示的数据量
              "name": "", // 分类名称
              "startDate": "", // 起始创建时间
              "endDate": "", // 结束创建时间
            
            }
            ```

            ​		

         2. **出参 `JSON` 格式** :

         ```
         {
           "success": true,
           "message": null,
           "errorCode": null,
           "data": [
             {
               "name": "测试分类",
               "createTime": "2023-09-18 12:02:31"
             },
             {
               "name": "test",
               "createTime": "2023-09-18 11:48:58"
             }
           ],
           "total": 4, // 总记录数
           "size": 10, // 每页展示的记录数
           "current": 1, // 当前页码
           "pages": 1 // 总共多少页
         }
         ```

      2. **`Mybatis Plus` 添加分页插件** :该插件可以帮助我们在 Mybatis Plus 中，方便地实现分页功能。编辑 `MybatisPlusConfig` 配置类，添加分页插件

      3. 添加基本`CRUD`操作 : 

         1. **添加表对应的 DO 类** 
         2. **新建 `mapper`** : 在 `/domain/mapper` 包下，创建 `CategoryMapper` 接口;
         3. **添加入参 `VO` 实体类** : 在`weblog-module-admin` 子模块，在 `vo` 包下，新增 `category` 包;
         4. **添加分类 service 业务类** : 在 `/service/impl` 包下，创建此接口的实现类 `AdminCategoryServiceImpl`
         5. **添加 controller** : 在 `/controller` 包下，创建 `AdminCategoryController` 分类控制器

      4. ##### 模糊查询

         1. 首先拿到了提交过来的查询页码、每页需要展示的数据数量两个字段，通过它们初始化了一个 `Page` 分页对象。然后，构建 `SQL` 的查询条件，包括当分类不为空时，添加名称的模糊查询；区间字段不为空时，构建 `create_time` 字段的大于等于、小于等于筛选，以及按创建时间倒叙排列。

            条件构建完毕后，通过调用 `categoryMapper.selectPage()` 方法执行分页查询，分页插件会自动帮助我们执行两条 `SQL` , `select count(*)` 用于查询记录总数，若有数据，则执行 `limit` 分页语句

         2. ```java
                @Autowired
                private CategoryMapper categoryMapper;
               
                @Override
                public PageResponse findCategoryList(FindCategoryPageListReqVO findCategoryPageListReqVO) {
                    // 获取当前页、以及每页需要展示的数据数量
                    Long current = findCategoryPageListReqVO.getCurrent();
                    Long size = findCategoryPageListReqVO.getSize();
            
                    // 分页对象(查询第几页、每页多少数据)
                    Page<CategoryDO> page = new Page<>(current, size);
            
                    // 构建查询条件
                    LambdaQueryWrapper<CategoryDO> wrapper = new LambdaQueryWrapper<>();
            
                    String name = findCategoryPageListReqVO.getName();
                    LocalDate startDate = findCategoryPageListReqVO.getStartDate();
                    LocalDate endDate = findCategoryPageListReqVO.getEndDate();
            
                    wrapper
                        .like(StringUtils.isNotBlank(name), CategoryDO::getName, name.trim()) // like 模块查询
                        .ge(Objects.nonNull(startDate), CategoryDO::getCreateTime, startDate) // 大于等于 startDate
                        .le(Objects.nonNull(endDate), CategoryDO::getCreateTime, endDate)  // 小于等于 endDate
                        .orderByDesc(CategoryDO::getCreateTime); // 按创建时间倒叙
            
                    // 执行分页查询
                    Page<CategoryDO> categoryDOPage = categoryMapper.selectPage(page, wrapper);
            
                    List<CategoryDO> categoryDOS = categoryDOPage.getRecords();
            
                    // DO 转 VO
                    List<FindCategoryPageListRspVO> vos = null;
                    if (!CollectionUtils.isEmpty(categoryDOS)) {
                        vos = categoryDOS.stream()
                                .map(categoryDO -> FindCategoryPageListRspVO.builder()
                                        .id(categoryDO.getId())
                                        .name(categoryDO.getName())
                                        .createTime(categoryDO.getCreateTime())
                                        .build())
                                .collect(Collectors.toList());
                    }
            
                    return PageResponse.success(categoryDOPage, vos);
                }
            
            ```

      5. ### 

4. #### 删除接口开发

   1. 拿到了分类 ID, 然后通过 `categoryMapper` 内部封装好的 `deleteById()` 方法，直接将主键 ID 传入，执行删除 `SQL`

5. #### 样式布局

   1. **样式分析 :** 包含三部分:

      - 顶部的分页搜索条件区域，主持按分类名称、创建时间来搜索；

      - ![image-20241030162242318](./assets/image-20241030162242318.png)

      - 中间的分类列表区域；

      - ![image-20241030162252727](./assets/image-20241030162252727.png)

      - 下方的分页区域，能够展示总数据量、每页展示多少条数据、当前页码等；

      - ![image-20241030162315475](./assets/image-20241030162315475.png)

   2. **添加顶部搜索** : 

      1. 通过 `<el-card>` [卡片组件](https://element-plus.org/zh-CN/component/card.html) 作为顶层容器，目的是为了实现一个卡片效果，同时，设置了其 `shadow="never"` 属性，指定卡片没有阴影。里层我们引入了多个 Element Plus 组件，包括 `<el-text>` 文字、`<el-input>` 输入框、`<el-date-picker>` [日期选择](https://element-plus.org/zh-CN/component/date-picker.html) 多个组件，这里我讲讲 `<el-date-picker>` 日期选择组件中，用到的每个属性的意思：
         - `type` : 日期选择类型，`daterange` 表示类型为区间选择；
         - `range-separator` ： 选择范围时的分隔符；
         - `start-placeholder` ： 范围选择时开始日期的占位内容；
         - `end-placeholder` ： 范围选择时结束日期的占位内容；

   3. **添加中间 Table 表格** : 

      1. 在顶部搜索布局下方，再新增一个卡片组件，然后在其中，添加一个新增按钮，以及 `<el-table>` 表格组件。关于表格组件，`:data` 属性用于渲染表格内数据，和变量 `tableData` 绑定到了一起，`border` 用于指定表格带边框，`stripe` 用于指定斑马纹效果。这里注意，*操作*一栏并非展示数据，而是添加了删除按钮。

   4. **添加下方分页组件** : 

      1. 官方也提供了现成的,还是简述参数功能:
         1. `v-model:current-page="current"` : 绑定当前页码，默认为 1；
         2. `v-model:page-size="size"` : 绑定每页显示的数据量，默认为 10；
         3. `:page-sizes="[10, 20, 50]"` : 指定每页显示多少条数据，有几种选项，如每页展示 10 条；
         4. `layout="total, sizes, prev, pager, next, jumper"` ： 指定分页组件的布局顺序，小哈这里指的是：总数据量在最前，跟着每页展示多少数据，上一页，当前页，下一页，跳转到指定页。


### 标签模块开发
