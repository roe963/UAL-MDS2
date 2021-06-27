import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaCliente extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout id="layout-menu" style="align-items: center; align-self: center;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-grow: 0; flex-shrink: 1; flex-basis: auto; align-self: stretch; margin-right: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xs); margin-left: var(--lumo-space-xl); margin-top: var(--lumo-space-xs); padding-top: var(--lumo-space-m); padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);" id="vl_ofertas" class="content">
  <h4 style="align-self: center;">Ofertas</h4>
  <vaadin-horizontal-layout id="layout-ofertas" style="align-self: stretch; justify-content: center;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout class="content" style="flex-grow: 0; flex-shrink: 1; flex-basis: auto; align-self: stretch; margin-right: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xs); margin-left: var(--lumo-space-xl); margin-top: var(--lumo-space-xs); padding-top: var(--lumo-space-m); padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);">
  <h4 style="flex-grow: 0; align-self: center;">Top ventas</h4>
  <vaadin-horizontal-layout style="margin-bottom: var(--lumo-space-m); align-self: center;">
   <label style="margin-right: var(--lumo-space-m); align-self: center;">Categoría</label>
   <vaadin-select value="Item one" id="select-categoria" style="align-self: center; flex-shrink: 1;"></vaadin-select>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="layout-topventas-categoria" style="align-self: stretch; justify-content: center;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-cliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCliente.is, VistaCliente);
