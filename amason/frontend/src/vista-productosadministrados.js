import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productosadministrados`
 *
 * VistaProductosadministrados element.
 *
 * @customElement
 * @polymer
 */
class VistaProductosadministrados extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-productosadministrados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosadministrados.is, VistaProductosadministrados);
