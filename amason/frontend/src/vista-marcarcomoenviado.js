import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-marcarcomoenviado`
 *
 * VistaMarcarcomoenviado element.
 *
 * @customElement
 * @polymer
 */
class VistaMarcarcomoenviado extends PolymerElement {

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
        return 'vista-marcarcomoenviado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMarcarcomoenviado.is, VistaMarcarcomoenviado);
